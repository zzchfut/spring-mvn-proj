package com.suncreate.mvn.web.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.suncreate.mvn.web.command.NewsCommand;


/**
 * @author Vincent.wang
 *
 */
public class NewsValidator implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {
        return NewsCommand.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "title", "news.title.empty");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "description", "news.description.empty");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "address", "news.address.empty");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "newsTime", "news.newsTime.empty");
    }

}
