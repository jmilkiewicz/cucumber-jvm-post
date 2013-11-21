package com.zsoltfabok.blog.spring;

import com.zsoltfabok.blog.SimpleTextMunger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/applicationContext.xml"})
public class SimpleTextMungerTest {
    @Autowired
    private SimpleTextMunger simpleTextMunger;

    @Test
    public void shouldMungeASimpleWord() {
        assertEquals("wrod", simpleTextMunger.execute("word"));
    }
}
