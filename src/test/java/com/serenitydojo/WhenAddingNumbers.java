package com.serenitydojo;

import org.assertj.core.api.Assertions;
import org.assertj.core.data.Percentage;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.data.Percentage.withPercentage;
import java.util.List;


public class WhenAddingNumbers {
    @Test
    public void shouldAddTwoIntegersCorrectly() {
        int a = 1;
        int b = 2;
        String color = "red,green,blue";
        String otherColor = "Red";

        int sum = a + b;
        //assertThat(sum).isEqualTo(2);
        //assertThat(sum).isBetween(1,10);
        //assertThat(sum).isCloseTo(4, withPercentage(10));

        //assertThat(color).isEqualToIgnoringCase(otherColor);
        assertThat(color).contains("green");
        assertThat(color).containsPattern("[g|G]reen");
    }

    @Test
    public void shouldWorkWithCollections() {
        List<String> colors = Arrays.asList("red", "green", "blue");

        assertThat(colors).hasSize(3);
        assertThat(colors).contains("green");
        assertThat(colors).containsExactly("red", "green", "blue");
        assertThat(colors).containsExactlyInAnyOrder("red", "blue", "green");
        assertThat(colors).doesNotContain("yellow");

    }




}
