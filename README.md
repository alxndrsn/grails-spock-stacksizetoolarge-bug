To recreate the bug, check this project out and run

	grails --stacktrace test-app

Result:

	| Loading Grails 2.0.3
	| Configuring classpath
	| Configuring classpath.
	| Environment set to test
	| Environment set to test.
	| Environment set to test..
	| Environment set to test...
	| Environment set to test....
	| Environment set to test.....
	| Running 1 unit test...
	| Running 1 unit test... 1 of 1
	| Failure:  testSomething(stacktoolarge.ATests)
	|  java.lang.AssertionError: Implement me
		at org.junit.Assert.fail(Assert.java:93)
		at stacktoolarge.ATests.testSomething(ATests.groovy:15)
	| Completed 1 unit test, 1 failed in 8848ms
	| Tests FAILED  - view reports in target/test-reports
	| Error Error executing script TestApp: (class: stacktoolarge/StackTooLargeSpec, method: $spock_feature_1_0 signature: ()V) Stack size too large (NOTE: Stack trace has been filtered. Use --verbose to see entire trace.)
	java.lang.VerifyError: (class: stacktoolarge/StackTooLargeSpec, method: $spock_feature_1_0 signature: ()V) Stack size too large
		at org.spockframework.runtime.SpecUtil.getFeatureCount(SpecUtil.java:85)
		at org.spockframework.runtime.SpecUtil$getFeatureCount.call(Unknown Source)
		at grails.plugin.spock.test.GrailsSpecTestType$_doPrepare_closure2.doCall(GrailsSpecTestType.groovy:61)
		at grails.plugin.spock.test.GrailsSpecTestType.doPrepare(GrailsSpecTestType.groovy:61)
		at _GrailsTest_groovy$_run_closure4.doCall(_GrailsTest_groovy:282)
		at _GrailsTest_groovy$_run_closure4.call(_GrailsTest_groovy)
		at _GrailsTest_groovy$_run_closure2.doCall(_GrailsTest_groovy:248)
		at _GrailsTest_groovy$_run_closure1_closure21.doCall(_GrailsTest_groovy:195)
		at _GrailsTest_groovy$_run_closure1.doCall(_GrailsTest_groovy:184)
		at org.codehaus.gant.GantMetaClass.invokeMethod(GantMetaClass.java:133)
		at org.codehaus.gant.GantMetaClass.invokeMethod(GantMetaClass.java:133)
		at org.codehaus.gant.GantBinding$_initializeGantBinding_closure5_closure16_closure18.doCall(GantBinding.groovy:185)
		at org.codehaus.gant.GantBinding$_initializeGantBinding_closure5_closure16_closure18.doCall(GantBinding.groovy)
		at java_util_concurrent_Callable$call.call(Unknown Source)
		at org.codehaus.gant.GantBinding.withTargetEvent(GantBinding.groovy:90)
		at org.codehaus.gant.GantBinding.this$4$withTargetEvent(GantBinding.groovy)
		at org.codehaus.gant.GantBinding$_initializeGantBinding_closure5_closure16.doCall(GantBinding.groovy:185)
		at org.codehaus.gant.GantBinding$_initializeGantBinding_closure5_closure16.doCall(GantBinding.groovy)
		at org.codehaus.gant.GantMetaClass.invokeMethod(GantMetaClass.java:133)
		at TestApp$_run_closure1.doCall(TestApp.groovy:82)
		at org.codehaus.gant.GantMetaClass.invokeMethod(GantMetaClass.java:133)
		at org.codehaus.gant.GantMetaClass.invokeMethod(GantMetaClass.java:133)
		at org.codehaus.gant.GantBinding$_initializeGantBinding_closure5_closure16_closure18.doCall(GantBinding.groovy:185)
		at org.codehaus.gant.GantBinding$_initializeGantBinding_closure5_closure16_closure18.doCall(GantBinding.groovy)
		at java_util_concurrent_Callable$call.call(Unknown Source)
		at org.codehaus.gant.GantBinding.withTargetEvent(GantBinding.groovy:90)
		at org.codehaus.gant.GantBinding.this$4$withTargetEvent(GantBinding.groovy)
		at org.codehaus.gant.GantBinding$_initializeGantBinding_closure5_closure16.doCall(GantBinding.groovy:185)
		at org.codehaus.gant.GantBinding$_initializeGantBinding_closure5_closure16.doCall(GantBinding.groovy)
		at java_util_concurrent_Callable$call.call(Unknown Source)
		at gant.Gant$_dispatch_closure5.doCall(Gant.groovy:381)
		at gant.Gant$_dispatch_closure7.doCall(Gant.groovy:415)
		at gant.Gant$_dispatch_closure7.doCall(Gant.groovy)
		at java_util_concurrent_Callable$call.call(Unknown Source)
		at gant.Gant.withBuildListeners(Gant.groovy:427)
		at gant.Gant.this$2$withBuildListeners(Gant.groovy)
		at gant.Gant$this$2$withBuildListeners.callCurrent(Unknown Source)
		at gant.Gant.dispatch(Gant.groovy:415)
		at gant.Gant.this$2$dispatch(Gant.groovy)
		at gant.Gant.invokeMethod(Gant.groovy)
		at gant.Gant.executeTargets(Gant.groovy:591)
		at gant.Gant.executeTargets(Gant.groovy:590)
	| Error Error executing script TestApp: (class: stacktoolarge/StackTooLargeSpec, method: $spock_feature_1_0 signature: ()V) Stack size too large
