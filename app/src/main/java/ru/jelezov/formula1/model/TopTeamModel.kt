package ru.jelezov.formula1.model

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "topTeam_table")
data class TopTeamModel (
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val name: String,
    val points: String,
    val position: String
)