/*
 * Copyright 2020 LinkedIn Corp.
 * Licensed under the BSD 2-Clause License (the "License").
 * See License in the project root for license information.
 */

package com.linkedin.avroutil1.compatibility;

import org.testng.Assert;
import org.testng.annotations.Test;


/**
 * tests record classes generated by {@link AvroCompatibilityHelper} under different avro versions
 */
public class AvroCompatibilityHelperGeneratedRecordClassesTest {

  @Test
  public void testRecordGeneratedUnderAvro14HasGetClassSchema() throws Exception {
    Assert.assertEquals(under14.SimpleRecord.getClassSchema(), under14.SimpleRecord.SCHEMA$);
  }

  @Test
  public void testRecordGeneratedUnderAvro15HasGetClassSchema() throws Exception {
    Assert.assertEquals(under15.SimpleRecord.getClassSchema(), under15.SimpleRecord.SCHEMA$);
  }

  @Test
  public void testRecordGeneratedUnderAvro16HasGetClassSchema() throws Exception {
    Assert.assertEquals(under16.SimpleRecord.getClassSchema(), under16.SimpleRecord.SCHEMA$);
  }

  @Test
  public void testRecordGeneratedUnderAvro17HasGetClassSchema() throws Exception {
    Assert.assertEquals(under17.SimpleRecord.getClassSchema(), under17.SimpleRecord.SCHEMA$);
  }
}
