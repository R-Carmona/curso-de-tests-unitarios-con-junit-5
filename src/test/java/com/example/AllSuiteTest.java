package com.example;

import lombok.extern.java.Log;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

@Log
@RunWith(JUnitPlatform.class)
//@SelectPackages("com.example.seccion4")
@SelectPackages("")
//@IncludeTags("controller")
//@IncludeTags("dataBase")
class AllSuiteTest {



}
