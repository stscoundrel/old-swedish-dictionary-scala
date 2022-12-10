package io.github.stscoundrel.oldswedish

import java.io.InputStream
import java.io.InputStreamReader
import java.io.Reader

import com.google.gson.Gson

class Dictionary {
  private final val DICTIONARY_RESOURCE_PATH = "/old-swedish-dictionary.json"
  private var entries: Array[DictionaryEntry] = _

  private def readDictionary(): Array[DictionaryEntry] = {
    val inputStream = getClass.getResourceAsStream(DICTIONARY_RESOURCE_PATH)
    val reader = new InputStreamReader(inputStream)

    val gson = new Gson()

    val result = gson.fromJson(reader, classOf[Array[DictionaryEntry]])

    result
  }

  def getDictionary(): Array[DictionaryEntry] = {
    if (entries == null) {
      entries = readDictionary()
    }

    entries
  }
}
