package ru.sbertech.reflection;

/**
 * Created by anton on 9/12/16.
 */
public class GeneratorOne implements PasswordGenerator
{
    @Override
    public String generate() {
        return "1";
    }
}
