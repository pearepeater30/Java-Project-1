/**
 * JobRoleTest.java
 */

package org.com1027.formative.ng00367;

import static org.junit.Assert.assertEquals;

import org.com1027.formative.ng00367.CompanyPosition;
import org.junit.Test;

/**
 * The test class CompanyPositionTest.
 * 
 * @author Matthew Casey
 * @author Stella Kazamia
 * @version 2017
 */
public class CompanyPositionTest {

  /**
   * Test accessors and mutators for a job role.
   */
  @Test
  public void testAccessorsMutators() {
    // Create a job companyPosition object.
    CompanyPosition companyPosition = new CompanyPosition();

    // Test setting and getting the company position.
    companyPosition.setPositionName("Senior Lecturer");
    assertEquals("Senior Lecturer", companyPosition.getPositionName());
  }
}
