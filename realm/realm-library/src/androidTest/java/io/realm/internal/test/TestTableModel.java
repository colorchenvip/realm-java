/*
 * Copyright 2014 Realm Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.realm.internal.test;

import java.util.Date;

import io.realm.internal.DefineTable;

/**
 * This model is used to generate classes that are used only for the tests.
 */
public class TestTableModel {

    @DefineTable
    class TestEmployee {
        String firstName;
        String lastName;
        int salary;
        boolean driver;
        byte[] photo;
        Date birthdate;
        Object extra;
        TestPhone phones;
    }

    @DefineTable
    class TestPhone {
        String type;
        String number;
    }

    @DefineTable
    class TestNumbers {
        long longNum;
        float floatNum;
        double doubleNum;
    }

    @DefineTable
    class TestQueryTable {
        long longNum;
        float floatNum;
        double doubleNum;
        String stringVal;
    }

    @DefineTable
    class AllTypes {
        boolean  boolCol;
        java.util.Date dateCol;
        double doubleCol;
        int intCol;
        long longCol;
        float floatCol;
        String stringCol;
        byte[] byteCol;
        Car carTableCol; // Subtable of the type Car defined as a typed table
        Object mixedCol; // Can hold any of the types
    }

    @DefineTable
    class Car {
        String  brand;
        String  model;
        int year;
    }
}
