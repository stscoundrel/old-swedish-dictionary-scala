package io.github.stscoundrel.oldswedish

import com.google.gson.Gson

import java.io.InputStreamReader
import java.util.zip.GZIPInputStream

class Dictionary {
  private final val DICTIONARY_RESOURCE_PATH = "/old-swedish-dictionary.min.json.gz"
  private lazy val entries: Array[DictionaryEntry] = readDictionary()

  def getDictionary(): Array[DictionaryEntry] = entries

  private def readDictionary(): Array[DictionaryEntry] = {
    val inputStream = getClass.getResourceAsStream(DICTIONARY_RESOURCE_PATH)
    val gzipStream = new GZIPInputStream((inputStream))
    val reader = new InputStreamReader(gzipStream)

    val gson = new Gson()

    val result = gson.fromJson(reader, classOf[Array[DictionaryEntry]])

    result
  }
}
