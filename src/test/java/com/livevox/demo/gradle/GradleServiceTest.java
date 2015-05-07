/*
 *  Copyright 2014 LiveVox, Inc.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package com.livevox.demo.gradle;

import java.util.Calendar;
import java.util.Date;

import org.apache.commons.lang3.time.DateFormatUtils;
import org.junit.Before;
import org.junit.Test;

import com.livevox.demo.gradle.GradleService;

import static org.junit.Assert.*;

public class GradleServiceTest {
    GradleService service;
    
    @Before
    public void setUp() {
        service = new GradleService();
    }
    
    @Test
    public void testSayHello() {
        assertEquals("Hello From Gradle!", service.sayHello());
    }
    
    @Test
    public void testFormatDate() {
        Date now = Calendar.getInstance().getTime();
        String expected = DateFormatUtils.ISO_DATE_FORMAT.format(now);
        String actual = service.formatDate(now);
        assertEquals(expected, actual);
    }
}
