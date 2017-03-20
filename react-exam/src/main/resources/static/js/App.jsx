var Link = ReactRouter.Link;
var IndexLink = ReactRouter.IndexLink;

var App = React.createClass( {
    render: function() {
        return (
            <div className="content">
                {this.props.children}
            </div>
        )
    }
});

window.App = App;