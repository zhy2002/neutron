import 'babel-polyfill';
import React from 'react';
import {mount} from 'enzyme';
import expect from 'expect';
import AddListComponent from './AddListComponent';
import NodeLabelComponent from '../neutron/NodeLabelComponent';
import MockService from '../neutron/MockService';


function setup() {
    const mockModel = MockService.createMockListUiNode();

    return mount(
        <AddListComponent
            model={mockModel}
            itemComponent={NodeLabelComponent}
        />
    );
}

describe('AddListComponent', function () {
    it('can render empty list', function () {
        const wrapper = setup();
        expect(wrapper).toExist();
    });
});
