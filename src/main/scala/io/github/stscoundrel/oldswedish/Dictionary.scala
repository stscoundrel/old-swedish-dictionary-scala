package io.github.stscoundrel.oldswedish

import com.google.gson.Gson

import java.io.InputStreamReader

class Dictionary {
  private final val DICTIONARY_RESOURCE_PATH = "/old-swedish-dictionary.json"
  private lazy val entries: Array[DictionaryEntry] = readDictionary()

  def getDictionary(): Array[DictionaryEntry] = entries

  private def readDictionary(): Array[DictionaryEntry] = {
    val inputStream = getClass.getResourceAsStream(DICTIONARY_RESOURCE_PATH)
    val reader = new InputStreamReader(inputStream)

    val gson = new Gson()

    val result = gson.fromJson(reader, classOf[Array[DictionaryEntry]])

    result
  }
}
