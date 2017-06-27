//import 'babel-polyfill'; //if things are missing
import React from 'react';
import AlertInfoComponent from './bootstrap3/AlertInfoComponent';
import expect from 'expect';
import {mount, shallow} from 'enzyme';


describe('es5', function () {
    describe('should define indexOf', function () {
        it('should return -1 when the value is not present', function () {
            expect([1, 2, 3].indexOf(4)).toEqual(-1);
        });
    });
});

describe('es6', () => {
    it('should destruct variable', () => {
        const {test} = {test: '1111'};
        expect(test).toEqual('1111');
    });
});

describe('react', () => {
    it('should shallow render', () => {
        const wrapper = shallow(<AlertInfoComponent>test</AlertInfoComponent>);
        expect(wrapper.find('span').length).toEqual(1);
    });

    it('should mount component', () => {
        const wrapper = mount(<AlertInfoComponent>test</AlertInfoComponent>);
        expect(wrapper.find('span').length).toEqual(1);
    });
});
