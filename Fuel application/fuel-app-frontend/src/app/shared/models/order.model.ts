export interface Order {
  orderId: string
  fuelStationId: string
  fuelStationName: string
  fuelId: string
  fuelType:string;
  capacity: number
  status:string
  scheduleDate:any
  dispatchDate:any
}
