import React from 'react';
import expect from 'expect';
import {shallow} from 'enzyme';
import NeutronHoc from './NodeLabelComponent';

const NodeLabelComponent = NeutronHoc.WrappedComponent;
const testText = 'Test';

function setup(dirty, checkDirty) {
    return shallow(
        <NodeLabelComponent
            label={testText}
            dirty={dirty}
            checkDirty={checkDirty}
        />
    );
}

describe('NodeLabelComponent', function () {
    it('should render label', function () {
        const wrapper = setup(false, false);
        expect(wrapper.find('span').text().trim()).toEqual(testText);
    });

    it('should not show dirty mark when check dirty is false', function () {
        const wrapper = setup(true, false);
        expect(wrapper.find('span').text().trim()).toEqual(testText);
    });

    it('can show dirty mark', function () {
        const wrapper = setup(true, true);
        expect(wrapper.find('span').text().trim()).toEqual(`${testText} *`);
    });
});
