/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package prj3;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import prj1.Prj1Test;
import prj2.Prj2Test;

/**
 *  We want to test that import of 2 levels of modularized test projects is OK
 */
public class Prj3Test extends Prj2Test
{

    public static final Logger LOGGER = LogManager.getLogger( Prj3Test.class );

    private Prj1Test prj1Test = new Prj1Test();
    
    public Prj3Test() {
        super();
    }
    
    @Override
    public void test() {
        
    }
    
}
