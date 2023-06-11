package com.renatoz.caresoft;

public interface HIPAACompliantUser {
    abstract boolean assignPin(int pin);
    abstract boolean accessAuthorized(Integer confirmedAuthID);
}

