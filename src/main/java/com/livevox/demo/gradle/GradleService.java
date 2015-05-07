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

import java.util.Date;

import org.apache.commons.lang3.time.DateFormatUtils;

/**
 * A simple service to say hello and format a date
 * 
 * @author ksorge
 * 
 */
public class GradleService {

    /**
     * Say hello the gradle way.
     * 
     * @return A string that says hello.
     */
    String sayHello() {
        return "Hello From Gradle!";
    }
    
    /**
     * Format a date in yyyy-MM-dd format.
     * 
     * @param date The date to format
     * @return A string with the formatted date.
     */
    String formatDate(Date date) {
        return DateFormatUtils.ISO_DATE_FORMAT.format(date);
    }
}
