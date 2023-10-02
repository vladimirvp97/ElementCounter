def countElements(List list) {
    def elementCountMap = [:]

    list.each { element ->
        elementCountMap[element] = elementCountMap.getOrDefault(element, 0) + 1
    }

    return elementCountMap
}

def inputList = [1, 3, 4, 5, 1, 5, 4]
def elementCountMap = countElements(inputList)

elementCountMap.each { key, value ->
    println("$key : $value")
}
