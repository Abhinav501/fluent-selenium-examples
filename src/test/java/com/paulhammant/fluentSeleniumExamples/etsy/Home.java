package com.paulhammant.fluentSeleniumExamples.etsy;

import com.paulhammant.fluentSeleniumExamples.WholeSuiteListener;
import org.openqa.selenium.WebDriver;
import org.seleniumhq.selenium.fluent.FluentWebDriver;
import org.seleniumhq.selenium.fluent.FluentWebElement;

import static org.openqa.selenium.By.id;

public class Home extends FluentWebDriver {
    public Home(WebDriver delegate) {
        super(delegate, WholeSuiteListener.codahaleMetricsMonitor);
        url().shouldMatch(".*etsy.com/");
    }

    protected FluentWebElement searchButton() {
        return button(id("search_submit"));
    }

    protected FluentWebElement searchFor() {
        return input(id("search-query"));
    }


}
