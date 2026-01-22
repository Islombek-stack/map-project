
      
# Java Map Examples

This repository contains basic examples of using the `Map` interface in Java with the most popular implementations:
- HashMap
- TreeMap
- LinkedHashMap

## 1. HashMap (no order)
```java
Map<String, Integer> hashMap = new HashMap<>();
hashMap.put("Apple", 3);
hashMap.put("Banana", 5);
hashMap.put("Orange", 2);

System.out.println(hashMap);
````

## 2. TreeMap (sorted by key)

```java
Map<String, Integer> treeMap = new TreeMap<>();
treeMap.put("Apple", 3);
treeMap.put("Banana", 5);
treeMap.put("Orange", 2);

System.out.println(treeMap); // sorted alphabetically
```

## 3. LinkedHashMap (insertion order)

```java
Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
linkedHashMap.put("Apple", 3);
linkedHashMap.put("Banana", 5);
linkedHashMap.put("Orange", 2);

System.out.println(linkedHashMap); // keeps insertion order
```

## Basic Map Methods

### put()

```java
map.put("Key", 10);
```

### get()

```java
int value = map.get("Key");
```

### containsKey()

```java
map.containsKey("Key");
```

### remove()

```java
map.remove("Key");
```

### Iteration

```java
for (Map.Entry<String, Integer> entry : map.entrySet()) {
    System.out.println(entry.getKey() + " = " + entry.getValue());
}
```

## Example: Word Counter

```java
String[] words = {"java", "map", "java", "hashmap", "map", "java"};
Map<String, Integer> counter = new HashMap<>();

for (String word : words) {
    counter.put(word, counter.getOrDefault(word, 0) + 1);
}

System.out.println(counter);
```

## Author

Islombek Abilbekov
Junior Java Developer
