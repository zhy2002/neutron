import moment from 'moment';
import StaticService from './StaticService';


function replaceDigit(c, i, a) {
    return i && c !== '.' && ((a.length - i) % 3 === 0) ? `,${c}` : c;
}

/*
 * Handles cultural specific parser and rendering.
 */
export default class FormattingService extends StaticService {

    static formatCurrency(n, symbol) {
        if (n === null || n === undefined)
            return '';
        const s = symbol || '$';
        return s + n.toFixed(2).replace(/./g, replaceDigit);
    }

    static formatNumber(n, digits = 2) {
        if (n === null || n === undefined)
            return '';
        const num = typeof n === 'string' ? +n : n;
        return num.toFixed(digits).replace(/./g, replaceDigit);
    }

    static formatDate(date) {
        if (!date)
            return '';

        return moment.utc(date).local().format('YYYY-MM-DD HH:mm:ss');
    }
}
