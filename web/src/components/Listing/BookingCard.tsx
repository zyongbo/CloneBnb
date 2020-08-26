import * as React from "react";
import { RouteComponentProps } from "react-router-dom";
import Card from "@material-ui/core/Card";
import CardContent from "@material-ui/core/CardContent";
import "./MainSection.css";

interface Props extends RouteComponentProps<any> {}

const BookingCard: React.FC<Props> = (props) => {
  return (
    <div className="stickyCard">
      <Card
        className="stickyCard"
        variant="outlined"
        style={{
          border: "1px solid rgb(221, 221, 221)",
          borderRadius: "12px",
          padding: "24px",
          boxShadow: "rgba(0, 0, 0, 0.12) 0px 5px 17px",
        }}
      >
        <CardContent>
          <h2
            style={{
              fontWeight: 500,
            }}
          >
            Add Dates for pricing
          </h2>
          <br />

          {/* Grid Here */}
          {/* Form fields Here */}
          {/* Form Submit Button Here */}
        </CardContent>
      </Card>
    </div>
  );
};

export default BookingCard;