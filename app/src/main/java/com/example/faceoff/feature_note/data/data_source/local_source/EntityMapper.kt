package com.example.faceoff.feature_note.data.data_source.local_source

import com.example.faceoff.feature_note.domain.model.local_model.Profiles

fun Entity.toConvert(): Profiles {
    return Profiles(
        title = title,
        content = content,
        timestamp = timestamp,
        color = color,
        id = id
    )
}
