import expect from 'expect';
import SearchAdaptor from './SearchAdaptor';


describe('SearchAdaptor', function () {
    it('should whitespace in keyword', function () {
        const searchAdaptor = new SearchAdaptor();
        const encoded = searchAdaptor.encodeKeyword('test data');
        expect(encoded).toEqual('*test%20AND%20data*');
    });
});
