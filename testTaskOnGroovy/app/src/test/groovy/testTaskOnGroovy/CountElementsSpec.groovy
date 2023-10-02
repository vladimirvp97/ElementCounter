import spock.lang.Specification

class CountElementsSpec extends Specification {

    def "should count multiple occurrences of elements"() {
        expect:
        countElements([1, 3, 4, 5, 1, 5, 4]) == [1: 2, 3: 1, 4: 2, 5: 2]
    }

    def "should return empty map for empty list"() {
        expect:
        countElements([]) == [:]
    }

    def "should count single occurrences of elements"() {
        expect:
        countElements([1, 2, 3, 4]) == [1: 1, 2: 1, 3: 1, 4: 1]
    }

    def "should count a single element list"() {
        expect:
        countElements([1]) == [1: 1]
    }

    def "should count identical elements"() {
        expect:
        countElements([1, 1, 1]) == [1: 3]
    }

    def countElements(List list) {
        def elementCountMap = [:]
        list.each { element ->
            elementCountMap[element] = elementCountMap.getOrDefault(element, 0) + 1
        }
        return elementCountMap
    }
}
