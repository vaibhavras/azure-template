package com.azure.azuretemplate.restcontroller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.*;

class SampleTestUnitTestController {


    @InjectMocks
    private Sample sampleController;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void shouldTestController() {
        String responseEntity = sampleController.hello();
        assertEquals("Hello from Azure template poc", responseEntity);
//        assertEquals(responseEntity.getBody(), detectedLanguage);
    }
}