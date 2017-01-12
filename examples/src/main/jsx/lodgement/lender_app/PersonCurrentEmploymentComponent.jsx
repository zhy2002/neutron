import React from 'react';
import Paper from 'material-ui/Paper';
import NeutronComponent from '../../materialui/NeutronComponent';

export default class PersonCurrentEmploymentComponent extends NeutronComponent {

    render() {
        return (
            <div className="row expanded">
                <div className="small-12 columns">
                    <Paper>
                        <div className="row expanded">
                            <div className="medium-6">
                                paye
                            </div>
                            <div className="medium-6">
                                test2
                            </div>
                        </div>
                    </Paper>
                </div>

            </div>
        );
    }
}
