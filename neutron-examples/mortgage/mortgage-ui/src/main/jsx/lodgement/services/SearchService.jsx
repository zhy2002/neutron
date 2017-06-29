import StaticService from '../../neutron/StaticService';
import SearchAdaptor from '../../neutron/SearchAdaptor';
import FormattingService from '../../neutron/FormattingService';

class EmailSearchAdaptor extends SearchAdaptor {

    shouldSearch(key) {
        return key && key.length >= 3 && key.indexOf('@') < 0;
    }

    encodeKeyword() {
        return 'account';
    }

    addWildCard(key) {
        return key;
    }

    adaptOptionData(data, key) {
        const suffix = FormattingService.afterFirst(data.value, '@');
        const newValue = `${key}@${suffix}`;
        return {
            value: newValue,
            text: newValue
        };
    }
}

const emailSearchAdaptor = new EmailSearchAdaptor();

export default class SearchService extends StaticService {

    static getEmailSearchAdaptor() {
        return emailSearchAdaptor;
    }
}
