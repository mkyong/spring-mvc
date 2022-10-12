package com.mkyong.user.validator;

import org.springframework.stereotype.Component;

import java.util.regex.Pattern;

@Component("emailValidator")
public class EmailValidator {

    private Pattern pattern;

    private static final String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
            + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

    public EmailValidator() {
        pattern = Pattern.compile(EMAIL_PATTERN);
    }

    public boolean valid(final String email) {

        if (email == null || "".equals(email.trim())) return false;
        return pattern.matcher(email).matches();

    }
}