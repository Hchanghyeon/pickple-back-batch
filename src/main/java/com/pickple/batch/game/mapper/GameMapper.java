package com.pickple.batch.game.mapper;

import java.time.LocalDateTime;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.pickple.batch.game.domain.GameStatusUpdate;

@Mapper
public interface GameMapper {

    List<GameStatusUpdate> findGamesByStatusAndPlayDateStartTimeBeforeNow(
            final String status,
            final LocalDateTime nowDateTime
    );

    List<GameStatusUpdate> findGamesByStatusAndPlayDateEndTimeBeforeNow(
            final String status,
            final LocalDateTime nowDateTime
    );

    void updateGameStatus(final Long id, final String status);
}
