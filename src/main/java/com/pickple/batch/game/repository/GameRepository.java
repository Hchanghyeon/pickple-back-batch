package com.pickple.batch.game.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.pickple.batch.game.domain.GameStatusUpdate;
import com.pickple.batch.game.mapper.GameMapper;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class GameRepository {

    private final GameMapper gameMapper;

    public List<GameStatusUpdate> findGamesByStatusAndPlayDateStartTimeBeforeNow(
            final String status,
            final LocalDateTime nowDateTime
    ) {
        return gameMapper.findGamesByStatusAndPlayDateStartTimeBeforeNow(status, nowDateTime);
    }

    public List<GameStatusUpdate> findGamesByStatusAndPlayDateEndTimeBeforeNow(
            final String status,
            final LocalDateTime nowDateTime
    ) {
        return gameMapper.findGamesByStatusAndPlayDateEndTimeBeforeNow(status, nowDateTime);
    }

    public void updateGameStatus(final Long id, final String status) {
        gameMapper.updateGameStatus(id, status);
    }
}
