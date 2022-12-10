package io.github.stscoundrel.oldswedish

import com.google.gson.annotations.SerializedName

case class DictionaryEntry(
  @(SerializedName @scala.annotation.meta.field)("a") val headword: String,
  @(SerializedName @scala.annotation.meta.field)("b") val partOfSpeech: Array[String],
  @(SerializedName @scala.annotation.meta.field)("c") val grammaticalAspect: String,
  @(SerializedName @scala.annotation.meta.field)("d") val information: String,
  @(SerializedName @scala.annotation.meta.field)("e") val definitions: Array[String],
  @(SerializedName @scala.annotation.meta.field)("f") val alternativeForms: Array[String],
)