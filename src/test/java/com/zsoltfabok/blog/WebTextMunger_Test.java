package com.zsoltfabok.blog;

import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;



@RunWith(Cucumber.class)
@Cucumber.Options(features="classpath:web_text_munger.feature")
public class WebTextMunger_Test {
}
