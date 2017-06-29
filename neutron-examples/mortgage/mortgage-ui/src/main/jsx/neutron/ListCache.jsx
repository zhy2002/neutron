function hasSameItems(list1, list2) {
    if (list1.length !== list2.length)
        return false;

    for (let i = 0; i < list1.length; i++) {
        if (list1[i] !== list2[i])
            return false;
    }

    return true;
}
export default class ListCache {

    constructor() {
        this.map = {};
    }

    getList(name, newList) {
        if (!(name in this.map) || !hasSameItems(this.map[name], newList)) {
            this.map[name] = newList;
        }

        return this.map[name];
    }
}
