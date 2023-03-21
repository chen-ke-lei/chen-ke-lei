package com.example.faststart.base.security;

import com.example.faststart.base.constants.StatusEnum;

import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Set;

@Data
public class UserInfo implements   UserDetails {
    private String userName;
    private String passWord;

    private int status;

    private Set<AuthorityInfo> authorities;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @Override
    public String getPassword() {
        return this.userName;
    }

    @Override
    public String getUsername() {
        return this.passWord;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return this.getStatus()!=StatusEnum.Lock.getCode();
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return this.getStatus()== StatusEnum.Available.getCode();
    }
}
