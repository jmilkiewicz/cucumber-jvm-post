package com.zsoltfabok.blog;

import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@Cucumber.Options(features = "classpath:simple_text_munger.feature", tags = {"@bar,@foo","@fii"})
public class SimpleTextMunger_ForOrBarAndFii {
}