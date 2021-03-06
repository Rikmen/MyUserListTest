package com.goshapp.myuserlisttest.di;

import com.goshapp.myuserlisttest.util.mvp.BasePresenter;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import dagger.MapKey;

@Documented
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@MapKey
public @interface PresenterKey {
    Class <? extends BasePresenter> value();
}
