package io.github.stscoundrel.oldswedish

import com.google.gson.annotations.SerializedName

import scala.annotation.meta.field

case class DictionaryEntry(
  @(SerializedName@field)("a") val headword: String,
  @(SerializedName@field)("b") val partOfSpeech: Array[String],
  @(SerializedName@field)("c") val grammaticalAspect: String,
  @(SerializedName@field)("d") val information: String,
  @(SerializedName@field)("e") val definitions: Array[String],
  @(SerializedName@field)("f") val alternativeForms: Array[String],
)