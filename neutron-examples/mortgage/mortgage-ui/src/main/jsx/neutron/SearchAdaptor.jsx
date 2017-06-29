const reservedChars = '+-=&|><!(){}[]^"~*?:\\/';

export default class SearchAdaptor {

    shouldSearch() {
        return true;
    }

    /**
     * Convert keyword to elastic search literal.
     */
    encodeKeyword(key) {
        let result = '';
        for (let i = 0; i < key.length; i++) {
            const char = key[i];
            if (reservedChars.indexOf(char) >= 0) {
                result += '\\';
            }
            result += char;
        }

        result = result.trim();
        result = result.replace(/\s+/, ' AND ');
        result = encodeURIComponent(result);
        return this.addWildCard(result);
    }

    addWildCard(key) {
        return `*${key}*`;
    }

    buildOptions(key, response) {
        const result = response.data.hits.hits;
        const list = new window.GWT.StringOptionArrayBuilder();
        result.forEach((item) => {
            const source = this.adaptOptionData(item['_source'], key);
            list.addItem(source.value, source.text);
        });
        return list.toArray();
    }

    adaptOptionData(data) {
        return data;
    }

}