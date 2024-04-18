package com.github.max_person;

import padeg.lib.Padeg;

/**
 * TODO Class Description
 *
 * @author Marat Gumerov
 * @since 18.04.2024
 */
public class AbobaMaker {
    public static String helloWorld(){
        Padeg.getOfficePadeg("a", 1);
        String s = "mvn install:install-file -Dfile=padeg-3.3.0.24.jar" +
            " -DlocalRepositoryPath=lib" +
            " -DgroupId=padeg" +
            " -DartifactId=padeg" +
            " -Dversion=3.3.0.24";
        return "hello world";
    }
}
