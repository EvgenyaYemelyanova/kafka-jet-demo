package com.example.common.messages;

import com.example.common.bean.Source;
import com.example.common.bean.Type;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OfficeStateMessage extends Message{

    public OfficeStateMessage() {
        this.source = Source.OFFICE;
        this.type = Type.ROUTE;
    }
}
