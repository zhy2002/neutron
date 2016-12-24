import React from 'react';

import NeutronComponent from '../materialui/NeutronComponent.jsx';

export default class HeaderComponent extends NeutronComponent {

    constructor(props) {
        super(props);
    }

    render() {
        return (
          <div className="top-bar">
              <div className="top-bar-left">
                  <h3 className="text-primary">Some Logo</h3>
              </div>
          </div>
        );
    }
}