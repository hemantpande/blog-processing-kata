package com.main;

import com.codekata.TextAnalyser;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TextAnalyserTests {

    private final String MSG_FOR_NULL_INPUT = "The text contains no words.";

    @Test
    public void GivenText_WhenItIsEmpty_ThenPrintTheEmptyTextMessage() {

        // arrange
        var analyser  = new TextAnalyser();
        String inputText = null;

        // act
        String output = analyser.process(inputText);

        //assert
        Assertions.assertEquals(MSG_FOR_NULL_INPUT, output);
    }



}
