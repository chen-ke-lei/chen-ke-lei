package com.example.faststart.base.security;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.security.core.GrantedAuthority;

@Data
@EqualsAndHashCode
public class AuthorityInfo implements GrantedAuthority {
    private String authorityCode;

    private String name;
    @Override
    public String getAuthority() {
        return authorityCode;
    }

}
