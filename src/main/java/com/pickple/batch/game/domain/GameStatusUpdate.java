package com.pickple.batch.game.domain;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class GameStatusUpdate {

    private Long id;
    private String status;
}
