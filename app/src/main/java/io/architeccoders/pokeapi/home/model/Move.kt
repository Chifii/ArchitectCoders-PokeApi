package io.architeccoders.pokeapi.home.model

import com.google.gson.annotations.SerializedName

data class Move(
	@SerializedName("move")
	val move: GeneralDescription,
	@SerializedName("version_group_details")
	val versionGroupDetails: List<VersionGroupDetail>
)

data class VersionGroupDetail(
	@SerializedName("level_learned_at")
	val levelLearnedAt: Int,
	@SerializedName("move_learn_method")
	val moveLearnMethod: GeneralDescription,
	@SerializedName("version_group")
	val versionGroup: GeneralDescription
)