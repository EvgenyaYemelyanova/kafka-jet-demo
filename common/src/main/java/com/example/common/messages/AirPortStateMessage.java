package com.example.common.messages;

import com.example.common.bean.AirPort;
import com.example.common.bean.Source;
import com.example.common.bean.Type;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AirPortStateMessage extends Message{
    private AirPort airport;

    public AirPortStateMessage() {
        this.source = Source.AIRPORT;
        this.type = Type.STATE;
    }

    public AirPortStateMessage(AirPort airport) {
        this();
        this.airport = airport;
    }
}
