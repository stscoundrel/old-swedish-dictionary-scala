# Old Swedish Dictionary

Old Swedish Dictionary for Scala / Java / JVM. The dictionary consists of 40 000+ Old Swedish words with Swedish translations.

Based on K.F. Söderwall's Medieval Swedish Dictionary


## Install

As Maven dependency.

```xml
<dependency>
  <groupId>io.github.stscoundrel</groupId>
  <artifactId>oldswedish</artifactId>
  <version>0.1.0</version> <!-- Note! Check latest release number -->
</dependency>
```


For alternative install methods, see the [Maven Central Repo](https://search.maven.org/artifact/io.github.stscoundrel/oldswedish)

### Usage

```scala

import io.github.stscoundrel.oldswedish.Dictionary
import io.github.stscoundrel.oldswedish.DictionaryEntry

val dictionary = new Dictionary()
val entries = dictionary.getDictionary()

println(entries(100).headword)           // "af bränna"
println(entries(100).part_of_speech)     // ["vb"]
println(entries(100).grammatical_aspect) // "v."
println(entries(100).definitions)        // ["afbränna, genom eld förstöra. hans trähws the af brendhe  [...and more]]

```

**Java interop**: Should you use this library with Java, you may need to make some minor adjustements. For example, Java may consider fields case class DictionaryEntry to be "private". You can get around this by calling them as getters, like `myEntry.headword()` instead of `myEntry.headword`


Individual words are returned in format of:

```scala
{
  headword: String,
  partOfSpeech: Array[String],
  grammaticalAspect: String,
  information: String,
  definitions: Array[String],
  alternativeForms: Array[String],
}
```

### About "Dictionary of Old Swedish"

_"Ordbok Öfver svenska medeltids-språket"_ dictionary was published in late 1884—1918 by K.F. Söderwall. Additional supplement to it was published in 1953—1973.

Old Swedish developed from Old East Norse, the eastern dialect of Old Norse, at the end of the Viking Age. Early Old Swedish was spoken from about 1225 until about 1375, and Late Old Swedish was spoken from about 1375 until about 1526.

The original material is licenced under [Creative Commons International (CC BY 4.0)](https://creativecommons.org/licenses/by/4.0/), made available by University of Gothenburg. The source code for this library is under MIT licence.

- https://spraakbanken.gu.se/en/resources/soederwall
- https://spraakbanken.gu.se/en/resources/soederwall-supp
