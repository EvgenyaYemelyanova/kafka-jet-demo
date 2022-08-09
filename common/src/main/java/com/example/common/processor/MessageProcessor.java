package com.example.common.processor;

import com.example.common.messages.Message;

public interface MessageProcessor<T extends Message> {

    void process(String jsonMessage);
}
