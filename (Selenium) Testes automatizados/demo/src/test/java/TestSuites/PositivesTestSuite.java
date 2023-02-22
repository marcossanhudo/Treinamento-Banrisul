package TestSuites;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

import TestCases.PurchaseSuccessfullyWithDataClassesTest;
import TestCases.PurchaseSuccessfullyTest;

@Suite
@SelectClasses({ PurchaseSuccessfullyWithDataClassesTest.class, PurchaseSuccessfullyTest.class })
public class PositivesTestSuite {

}
